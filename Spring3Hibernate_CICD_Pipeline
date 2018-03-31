job('SpringHibernate_CI_CD_Pipeline')
{
pipeline 
{
    agent any 
    stages 
    {
        stage('Code Stability') 
        { 
            steps 
            {
                build('CI-Spring3Hibernate Code Stability')
            }
        }
        stage('Code Quality') 
        { 
            steps 
            {
                build('CI-Spring3Hibernate Code Quality')
            }
        }
        stage('Code Coverage') 
        { 
            steps 
            {
                build('CI-Spring3Hibernate Code Coverage')
            }
        }
    }
}
}
