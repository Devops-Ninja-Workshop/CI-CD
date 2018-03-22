job('Spring3Hibernate Compile') {
    scm {
        git('https://github.com/opstr/ContinuousIntegration.git')
    }
   
    steps {
        maven{
         rootPOM('Spring3HibernateApp/pom.xml')
         goals('clean compile')   
        }
      
    }
}
