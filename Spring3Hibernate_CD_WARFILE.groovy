job('CD-Spring3Hibernate WAR_FILE ') {
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
         goals('install:install')     
        }
      
    }
}
