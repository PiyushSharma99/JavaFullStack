pipeline {    
    agent any             
    stages {        
        stage('Build') {            
            when { changeset "*Week9Assignment/AdvancedJavaAssignment5/AdvanceJavaAssignment5-1/**"}            
            steps {               
                bat '''git fetch                 
                cd Week9Assignment/AdvancedJavaAssignment5/AdvanceJavaAssignment5-1                
                mvn clean install'''           
                }       
            }   
        }   
    }