
job('CI-Spring3Hibernate Code Coverage') {
    scm {
        git {
            remote
            {
            url('https://github.com/opstr/ContinuousIntegration.git')
            }
            branch('master')  
        }
    }
   
    steps {
        maven{
         mavenInstallation('Maven')
         rootPOM('Spring3HibernateApp/pom.xml')
         goals('cobertura:cobertura')     
        }   
      
    }
}
