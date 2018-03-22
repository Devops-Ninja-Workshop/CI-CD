job('Spring3Hibernate Compile') {
    scm {
        git('https://github.com/opstr/ContinuousIntegration.git')
    }
   
    steps {
        maven{
         mavenInstallation('Maven 3.5.2')   
         rootPOM('Spring3HibernateApp/pom.xml')
        }
        maven('-e clean compile')
    }
}
