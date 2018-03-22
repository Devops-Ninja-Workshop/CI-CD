job('Spring3Hibernate Compile') {
    scm {
        git('https://github.com/opstr/ContinuousIntegration.git', master')
    }
   
    steps {
        maven{
         rootPOM('Spring3HibernateApp/pom.xml')
         goals('clean compile')   
        }
      
    }
}
