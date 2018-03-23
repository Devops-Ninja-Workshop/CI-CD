
job('Spring3Hibernate Code Stability') {
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
         goals('jar:jar')     
        }
      
    }
}
