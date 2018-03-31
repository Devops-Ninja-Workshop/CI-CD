
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
     publishers {
        cobertura('**/target/site/cobertura/coverage.xml') {
            failNoReports(true)
            sourceEncoding('ASCII')

            // the following targets are added by default to check the method, line and conditional level coverage
            methodTarget(50, 0, 0)
            lineTarget(50, 0, 0)
            conditionalTarget(50, 0, 0)
        }
    }
}
