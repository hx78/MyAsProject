
1、app是一个application, 引用本地的jar、aar、so, 提供多渠道发布

2、app2是一个application, 引用私服的jar、aar

3、app3是一个application
3.1 单元测试，在terminal中输入gradlew :app3:connectedCheck

4、myaar是一个android library，make可以生成aar和jar, 可发布到私服
4.1 单元测试，在terminal中输入gradlew :myaar:connectedCheck

5、myjar是一个java library，可发到私服，发布时才会生成jar
5.1 单元测试，在terminal中输入gradlew :myjar:test
