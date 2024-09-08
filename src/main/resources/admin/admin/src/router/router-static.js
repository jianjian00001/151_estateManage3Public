import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import bumenxinxi from '@/views/modules/bumenxinxi/list'
    import yuangong from '@/views/modules/yuangong/list'
    import baoxiuxinxi from '@/views/modules/baoxiuxinxi/list'
    import yezhuxinxi from '@/views/modules/yezhuxinxi/list'
    import cheweixinxi from '@/views/modules/cheweixinxi/list'
    import yonghu from '@/views/modules/yonghu/list'
    import loufangxinxi from '@/views/modules/loufangxinxi/list'
    import tingchexinxi from '@/views/modules/tingchexinxi/list'
    import feiyongxinxi from '@/views/modules/feiyongxinxi/list'
    import tousubianhao from '@/views/modules/tousubianhao/list'
    import gonggaoxinxi from '@/views/modules/gonggaoxinxi/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
          ,{
	path: '/bumenxinxi',
        name: '部门信息',
        component: bumenxinxi
      }
          ,{
	path: '/yuangong',
        name: '员工',
        component: yuangong
      }
          ,{
	path: '/baoxiuxinxi',
        name: '报修信息',
        component: baoxiuxinxi
      }
          ,{
	path: '/yezhuxinxi',
        name: '业主信息',
        component: yezhuxinxi
      }
          ,{
	path: '/cheweixinxi',
        name: '车位信息',
        component: cheweixinxi
      }
          ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
          ,{
	path: '/loufangxinxi',
        name: '楼房信息',
        component: loufangxinxi
      }
          ,{
	path: '/tingchexinxi',
        name: '停车信息',
        component: tingchexinxi
      }
          ,{
	path: '/feiyongxinxi',
        name: '费用信息',
        component: feiyongxinxi
      }
          ,{
	path: '/tousubianhao',
        name: '投诉编号',
        component: tousubianhao
      }
          ,{
	path: '/gonggaoxinxi',
        name: '公告信息',
        component: gonggaoxinxi
      }
        ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
