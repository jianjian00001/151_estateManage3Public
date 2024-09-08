const base = {
    get() {
                return {
            url : "http://localhost:8080/springboot003ds/",
            name: "springboot003ds",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot003ds/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "小区物业管理系统"
        } 
    }
}
export default base
