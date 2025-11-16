pipeline {
    agent {
        label 'slave-java'
    }
    stages {
        stage ('build stage') {
            steps {
                echo "this from script block"
                script {
                    def course = "k8s"
                    println("thanks for enrolling")
                }
            }
        }
    }
}