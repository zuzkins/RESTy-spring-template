# Simple maven project template for Spring-MVC used as a REST engine with JSON encoding

This is a basic setup you need when kicking off a starting project using spring-mvc 3.0 and aiming for a RESTy architecture.

This is a compilation of examples found everywhere which together make a working REST example of spring app using JSON encoding. It really isn't more than a showecase and/or template for new projects. 
It basically contains only 1 controller which echoes what is beaing POSTed to it. Kind of a hello world app. 
But it contains the needed dependencies, and configuration.

Its based on maven2 and can be run using the command
	mvn jetty:run

The jetty server shall start and listen on port 1234, contextPath set to root (/).
If you want to test it you must:
1. supply the required Content-Type and Accept headers (application/json)
2. use POST (no other method supported)
3. target url should be something like: http://localhost:1234/hello/${name} - where ${name} is a string bound to controller's parameter called name
4. curl example: 
	curl -XPOST -H "Accept: application/json" -H "Content-Type: application/json" -d "{\"contents\": \"ahoj\"}" http://localhost:1234/hello/zuzkins
