[<img src="https://cdn.anychart.com/images/logo-transparent-segoe.png?2" width="234px" alt="AnyChart - Robust JavaScript/HTML5 Chart library for any project">](https://anychart.com)
# Clojure basic template

This example shows how to use Anychart library with the Clojure programming language and MySQL database.

## Running

To use this sample you must have JAVA installed, as described at [JAVA installation page](https://www.java.com/en/download/help/download_options.xml);
 MySQL installed and running, if not please check out [MySQL download page](https://dev.mysql.com/downloads/installer/) 
 and follow [these instructions](http://dev.mysql.com/doc/refman/5.7/en/installing.html);
 and [Leiningen](https://leiningen.org/).


To check your installations, run the following command in the command line:
```
$ java -version
java version "1.8.0_181"
Java(TM) SE Runtime Environment (build 1.8.0_181-b13)
Java HotSpot(TM) 64-Bit Server VM (build 25.181-b13, mixed mode)     # sample output

$ lein -v
Leiningen 2.7.1 on Java 1.8.0_181 Java HotSpot(TM) 64-Bit Server VM    # sample output

$ mysql --version
mysql  Ver 14.14 Distrib 5.5.52, for debian-linux-gnu (x86_64) using readline 6.   # sample output
```

To start this example run commands listed below.

Clone the repository from github.com:
```
$ git clone git@github.com:anychart-integrations/clojure-mysql-template.git
```

Navigate to the repository folder:
```
$ cd clojure-mysql-template
```

Build project:
```
$ lein uberjar
```

Set up MySQL database, use -u -p flags to provide username and password:
```
$  mysql < database_backup.sql
```

Run example:
```
$ java -jar target/clojure-mysql-template.jar
```

Open browser at http://localhost:8080/

## Workspace
Your workspace should look like:
```
clojure-mysql-template/
    resources/
        public/
            css/
                style.css       # css style
    src/
        clojure_mysql_teamplte
            core.clj       # main code
    database_backup.sql     # MySQL database dump
    README.md
    LICENSE
    ...
```

## Technologies
Language - [Clojure](https://clojure.org)<br />
Build tool - [Leiningen](https://leiningen.org/)<br />
Database - [MySQL](https://www.mysql.com/)<br />

## Further Learning
* [Documentation](https://docs.anychart.com)
* [JavaScript API Reference](https://api.anychart.com)
* [Code Playground](https://playground.anychart.com)
* [Technical Support](https://anychart.com/support)

## License
[© AnyChart.com - JavaScript charts](http://www.anychart.com). Released under the [Apache 2.0 License](https://github.com/anychart-integrations/ruby-sinatra-mysql-template/blob/master/LICENSE).