const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmsgh0r/",
            name: "ssmsgh0r",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmsgh0r/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "微信小程序的驾校预约管理系统"
        } 
    }
}
export default base
