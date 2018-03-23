pipeline 
{
    agent any 
    stages 
    {
        stage('Code Stability') 
        { 
            steps 
            {
                build('Spring3Hibernate Code Stability')
            }
        }
        stage('Code Quality') 
        { 
            steps 
            {
                build('Spring3Hibernate Code Quality')
            }
        }
        stage('Code Coverage') 
        { 
            steps 
            {
                build('Spring3Hibernate Code Coverage')
            }
        }
    }
}
