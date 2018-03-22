job('Spring3Hibernate Compile') {
    scm {
        git {
            url("https://github.com/opstr/ContinuousIntegration.git")
            createTag(false)
    }
   
    steps {
        maven{
         mavenInstallation("Maven 3.5.3")
         rootPOM('Spring3HibernateApp/pom.xml')
         goals('clean compile')   
        }
      
    }
}
