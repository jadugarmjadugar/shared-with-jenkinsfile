def call(Map config = [:]) {
    loadLinuxScript(name: 'script_test.sh')
    sh "./script_test.sh ${config.name}"
}
