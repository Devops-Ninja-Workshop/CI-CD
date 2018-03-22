job('Spring3Hibernate Compile') {
    scm {
        git('https://github.com/opstr/ContinuousIntegration.git')
    }
   
    steps {
        maven('-e clean compile')
    }
}
