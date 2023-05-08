def call() {
     loadLinuxScript(name: 'new.sh')
     sh 'echo "hello from fun"'
     sh "./new.sh"
}
