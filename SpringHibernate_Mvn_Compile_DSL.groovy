job(Spring3Hibernate Compile) {
    scm {
        git('https://github.com/opstr/ContinuousIntegration.gi)
    }
   
    steps {
        maven('-e clean compile')
    }
}
