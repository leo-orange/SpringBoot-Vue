<template>
    <!--页面部分-->
    <div>
        <table>
            <tr>
                <td>编号</td>
                <td>图书名称</td>
                <td>作者</td>
            </tr>
            <!--通过循环获取到其中的信息-->
            <tr v-for="item in books">
                <td>{{item.id}}</td>
                <td>{{item.name}}</td>
                <td>{{item.author}}</td>
            </tr>

        </table>
    </div>
</template>
<script>
    export default {
        name: "Book",
        data(){
            //虚假数据测试时使用
            return{
                msg:'Hello Vue',
                books:[
                    {
                        id:1,
                        name:'Java零基础实战',
                        author:'宁楠'
                    },
                    {
                        id:2,
                        name:'Vue零基础实战',
                        author:'张三'
                    },
                    {
                        id:3,
                        name:'Spring零基础实战',
                        author:'李四'
                    }
                ]
            }
        },
        created(){
            //通过跨端口传输,获取到SpringBoot里面的JSON数据
            const _this=this
            axios.get('http://localhost:8181/book/findAll').then(function (resp){
                _this.books=resp.data
            })
        }
    }
</script>

<style scoped>

</style>