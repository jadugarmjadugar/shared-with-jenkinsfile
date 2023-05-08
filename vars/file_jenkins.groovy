def call(){
  sh 'echo "hello from shared lib"'
  pipeline{
    agent any
    stages{
      stage('lib_stage1'){
        steps{
          script{
            echo "hello from shared library"
          }
        }
      }
    }
  }
}
