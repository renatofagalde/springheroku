

# deploy no heroku
## sequencia

### documentação da instalacao:
[heroku cli](https://devcenter.heroku.com/articles/getting-started-with-java#set-up)

instalação em linux/debian 
```shell
sudo snap install heroku --classic
```

login
```shell
heroku login
```

este nome deve ser único em todo heroku
```shell
heroku create springheroku01
```

adicionando banco de dados
```shell
heroku addons:create jawsdb
```

ver as variáveis de ambiente:
```shell
heroku config:get JAWSDB_URL
```

atribuir as variáveis de ambiente:
```shell
heroku config:set JDBC_DATABASE_URL = url  -a java-pass-heroku #é o valor anterior ao @ da variável JAWSDB_URL
heroku config:set JDBC_DATABASE_USERNAME = user  -a java-pass-heroku #é o primeiro valor antes dos dois pontos da variável JAWSDB_URL
heroku config:set JDBC_DATABASE_PASSWORD = pass  -a java-pass-heroku #é o valor entre os dois pontos e o @ da variável JAWSDB_URL
```

para checar
```shell
heroku config
```

definicao do deploy no heroku
criar um arquivo na raiz com este nome: Procfile
conteúdo:
``
web java -Dserver.port=$PORT -Dspring.profiles.active=prod $JAVA_OPTS -jar target/deploy*.jar
``

atualizar o ambiente
```shell
git push heroku master
```

