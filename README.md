# failsafe-demonstration
Demo how exclude integration tests and adding it to new maven profile.

Project will be build when it used 'mvn clean install' - integration tests aren't call.

If you use 'mvn clean install -P integrationTests, project's bulid faild because integration tests aren't working.
