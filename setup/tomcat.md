# Apache Tomcat Notes

## Installation notes for MacBook
Download [Apache Tomcat](https://tomcat.apache.org/download-90.cgi). Extract to preferred directory.

Add Environment Variables
```
$ vi ~/.profile;
```


```
# Exports
# * * * * * * * * * * * * * * * * * * * *
export JAVA_HOME=$(/usr/libexec/java_home)
export CATALINA_HOME=/Users/greggsetzer/Development/tools/apache-tomcat-9.0.26
```

So we can start/stop service manually, create a log directory:
```
$ cd $CATALINA_HOME/lib;
$ mkdir log;
```

### Basic Commands
```
# Start up tomcat
$ sh $CATALINA_HOME/bin/catalina.sh start

# Stop tomcat
$ sh $CATALINA_HOME/bin/catalina.sh stop
```

### Setup Management Console

Edit the tomcat-users.xml file to create admin user.
```
$ cd $CATALINA_HOME/conf;
$ vi tomcat-users.xml;
```

Add admin user.
```
<?xml version="1.0" encoding="UTF-8"?>
<tomcat-users xmlns="http://tomcat.apache.org/xml"
              xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
              xsi:schemaLocation="http://tomcat.apache.org/xml tomcat-users.xsd"
              version="1.0">
    <role rolename="admin-gui"/>
    <role rolename="manager-gui"/>
    <user username="admin" password="admin" roles="admin-gui,manager-gui" />
</tomcat-users>
```

```
# Restart service.
$ $CATALINA_HOME/bin/stop;
$ $CATALINA_HOME/bin/start;
```

Test that user can login:
http://localhost:8080/manager/html

