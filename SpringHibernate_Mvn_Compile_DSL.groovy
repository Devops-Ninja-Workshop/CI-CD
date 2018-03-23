job('Spring3Hibernate Compile') {
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
         mavenInstallation('')
         rootPOM('Spring3HibernateApp/pom.xml')
         goals('clean compile')     
        }
      
    }
}
