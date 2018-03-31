job('SpringHibernate_Deploy_Tomcat') {

    steps {

      ansiblePlaybook('roles/tomcat.yml') {  


        inventoryPath('/etc/ansible/hosts')  

        ansibleName('ansible-1')  

        colorizedOutput(true)  


      }  

    }  

}
