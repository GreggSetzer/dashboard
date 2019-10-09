# Apache Maven Notes

## Installation notes for MacBook
Download [Apache Maven](https://maven.apache.org/download.cgi). Extract to preferred directory.

Add Environment Variables
```
$ vi ~/.profile;
```


```
# Exports
# * * * * * * * * * * * * * * * * * * * *
export JAVA_HOME=$(/usr/libexec/java_home)
export MAVEN_HOME=/Users/greggsetzer/Development/tools/apache-maven-3.6.2
export PATH=$MAVEN_HOME/bin:$PATH
```

Commit changes
```
$ source ~/.profile;
```

