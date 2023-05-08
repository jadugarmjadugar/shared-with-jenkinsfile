//@Library('shared-with-jenkinsfile') _

pipeline{
    agent any
    stages{
        stage('hello print stage'){
            steps{
                echo "hello"
                //file_jenkins()
            }
        }
        stage('dynamic shared lib'){
            steps{
                script{
                    library 'shared-with-jenkinsfile'
                    file_jenkins()
                }
            }
        }
    }
}
