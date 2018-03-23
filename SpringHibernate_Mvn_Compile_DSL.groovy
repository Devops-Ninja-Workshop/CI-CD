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
         mavenInstallation('Maven')
            goals("build-helper:parse-version")
						goals("versions:set")
						property("newVersion", "\${parsedVersion.majorVersion}.\${parsedVersion.minorVersion}.\${parsedVersion.incrementalVersion}-\${BUILD_NUMBER}")
         rootPOM('Spring3HibernateApp/pom.xml')
         goals('clean compile')     
        }
      
    }
}
