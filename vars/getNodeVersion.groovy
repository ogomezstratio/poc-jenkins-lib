import groovy.json.JsonSlurperClassic

def call() {

    def json = readFile(file:'package.json')
    def props = new JsonSlurperClassic().parseText(json)
    def buildversion = props.version

    return buildversion
}