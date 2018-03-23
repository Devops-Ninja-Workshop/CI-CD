job('ansible-job') {

    steps {

      ansiblePlaybook('/ansible/playbook.yml') {  


        inventoryPath('/ansible/hosts')  

        ansibleName('ansible-1')  

        colorizedOutput(true)  


      }  

    }  

}
