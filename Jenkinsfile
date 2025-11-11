// this is main file

pipeline {
    agent {
        label 'slave-java'
    }
    stages {
        stage ('build stage') {
            steps {
                echo "i am checking error block and retry block"
                error "this is small error"
            }
        }
    }
}
