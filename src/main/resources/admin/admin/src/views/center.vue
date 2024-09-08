<template>
  <div>
    <el-form
      class="detail-form-content"
      ref="ruleForm"
      :model="ruleForm"
      label-width="80px"
    >  
     <el-row>
                              <el-col :span="12">
        <el-form-item   v-if="flag=='yonghu'"  label="个人账号" prop="gerenzhanghao">
          <el-input v-model="ruleForm.gerenzhanghao" readonly              placeholder="个人账号" clearable></el-input>
        </el-form-item>
      </el-col>
                                          <el-col :span="12">
        <el-form-item   v-if="flag=='yonghu'"  label="姓名" prop="xingming">
          <el-input v-model="ruleForm.xingming"               placeholder="姓名" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item v-if="flag=='yonghu'"  label="性别" prop="xingbie">
          <el-select v-model="ruleForm.xingbie" placeholder="请选择性别">
            <el-option
                v-for="(item,index) in yonghuxingbieOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='yonghu'"  label="年龄" prop="nianling">
          <el-input v-model="ruleForm.nianling"               placeholder="年龄" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='yonghu'"  label="身份证号码" prop="shenfenzhenghaoma">
          <el-input v-model="ruleForm.shenfenzhenghaoma"               placeholder="身份证号码" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='yonghu'"  label="手机号码" prop="shoujihaoma">
          <el-input v-model="ruleForm.shoujihaoma"               placeholder="手机号码" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='yonghu'"  label="车牌号" prop="chepaihao">
          <el-input v-model="ruleForm.chepaihao"               placeholder="车牌号" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="24">  
        <el-form-item v-if="flag=='yonghu'" label="相片" prop="xiangpian">
          <file-upload
          tip="点击上传相片"
          action="file/upload"
          :limit="3"
          :multiple="true"
          :fileUrls="ruleForm.xiangpian?ruleForm.xiangpian:''"
          @change="yonghuxiangpianUploadChange"
          ></file-upload>
        </el-form-item>
      </el-col>
                                                <el-col :span="12">
        <el-form-item   v-if="flag=='yuangong'"  label="工号" prop="gonghao">
          <el-input v-model="ruleForm.gonghao" readonly              placeholder="工号" clearable></el-input>
        </el-form-item>
      </el-col>
                                          <el-col :span="12">
        <el-form-item   v-if="flag=='yuangong'"  label="员工姓名" prop="yuangongxingming">
          <el-input v-model="ruleForm.yuangongxingming"               placeholder="员工姓名" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item v-if="flag=='yuangong'"  label="性别" prop="xingbie">
          <el-select v-model="ruleForm.xingbie" placeholder="请选择性别">
            <el-option
                v-for="(item,index) in yuangongxingbieOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='yuangong'"  label="年龄" prop="nianling">
          <el-input v-model="ruleForm.nianling"               placeholder="年龄" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='yuangong'"  label="身份证号码" prop="shenfenzhenghaoma">
          <el-input v-model="ruleForm.shenfenzhenghaoma"               placeholder="身份证号码" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='yuangong'"  label="手机号码" prop="shoujihaoma">
          <el-input v-model="ruleForm.shoujihaoma"               placeholder="手机号码" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="24">  
        <el-form-item v-if="flag=='yuangong'" label="相片" prop="xiangpian">
          <file-upload
          tip="点击上传相片"
          action="file/upload"
          :limit="3"
          :multiple="true"
          :fileUrls="ruleForm.xiangpian?ruleForm.xiangpian:''"
          @change="yuangongxiangpianUploadChange"
          ></file-upload>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item v-if="flag=='yuangong'"  label="部门" prop="bumen">
          <el-select v-model="ruleForm.bumen" placeholder="请选择部门">
            <el-option
                v-for="(item,index) in yuangongbumenOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
      </el-col>
                                                                                                                                          <el-form-item v-if="flag=='users'" label="用户名" prop="username">
        <el-input v-model="ruleForm.username" 
        placeholder="用户名"></el-input>
      </el-form-item>
      <el-col :span="24">
      <el-form-item>
        <el-button type="primary" @click="onUpdateHandler">修 改</el-button>
      </el-form-item>
      </el-col>
      </el-row>
    </el-form>
  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isMobile,isPhone,isURL,checkIdCard } from "@/utils/validate";

export default {
  data() {
    return {
      ruleForm: {},
      flag: '',
      usersFlag: false,
                                                                  yonghuxingbieOptions: [],
                                                                                                                                                yuangongxingbieOptions: [],
                                                                        yuangongbumenOptions: [],
                                                                                                                                        };
  },
  mounted() {
    var table = this.$storage.get("sessionTable");
    this.flag = table;
    this.$http({
      url: `${this.$storage.get("sessionTable")}/session`,
      method: "get"
    }).then(({ data }) => {
      if (data && data.code === 0) {
        this.ruleForm = data.data;
      } else {
        this.$message.error(data.msg);
      }
    });
                                            this.yonghuxingbieOptions = "男,女".split(',')
                                                                                                this.yuangongxingbieOptions = "男,女".split(',')
                                                this.$http({
      url: `option/bumenxinxi/bumenmingcheng`,
      method: "get"
    }).then(({ data }) => {
      if (data && data.code === 0) {
        this.yuangongbumenOptions = data.data;
      } else {
        this.$message.error(data.msg);
      }
    });
                                                                                          },
  methods: {
                                                                                                                                                                                                                                                                                                                                                yonghuxiangpianUploadChange(fileUrls) {
        this.ruleForm.xiangpian = fileUrls;
    },
                                                                                        yuangongxiangpianUploadChange(fileUrls) {
        this.ruleForm.xiangpian = fileUrls;
    },
                                                                                                    onUpdateHandler() {
                              if((!this.ruleForm.gerenzhanghao)&& 'yonghu'==this.flag){
        this.$message.error('个人账号不能为空');
        return
      }
                                                                  if((!this.ruleForm.mima)&& 'yonghu'==this.flag){
        this.$message.error('密码不能为空');
        return
      }
                                                                  if((!this.ruleForm.xingming)&& 'yonghu'==this.flag){
        this.$message.error('姓名不能为空');
        return
      }
                                                                                                                              if( 'yonghu' ==this.flag && this.ruleForm.nianling&&(!isIntNumer(this.ruleForm.nianling))){
       this.$message.error(`年龄应输入整数`);
        return
      }
                                                                                                if( 'yonghu' ==this.flag && this.ruleForm.shenfenzhenghaoma&&(!checkIdCard(this.ruleForm.shenfenzhenghaoma))){
        this.$message.error(`身份证号码应输入身份证格式`);
        return
      }
                                                      if( 'yonghu' ==this.flag && this.ruleForm.shoujihaoma&&(!isMobile(this.ruleForm.shoujihaoma))){
        this.$message.error(`手机号码应输入手机格式`);
        return
      }
                                                                                                                                                                              if((!this.ruleForm.gonghao)&& 'yuangong'==this.flag){
        this.$message.error('工号不能为空');
        return
      }
                                                                  if((!this.ruleForm.mima)&& 'yuangong'==this.flag){
        this.$message.error('密码不能为空');
        return
      }
                                                                  if((!this.ruleForm.yuangongxingming)&& 'yuangong'==this.flag){
        this.$message.error('员工姓名不能为空');
        return
      }
                                                                                                                              if( 'yuangong' ==this.flag && this.ruleForm.nianling&&(!isIntNumer(this.ruleForm.nianling))){
       this.$message.error(`年龄应输入整数`);
        return
      }
                                                                                                if( 'yuangong' ==this.flag && this.ruleForm.shenfenzhenghaoma&&(!checkIdCard(this.ruleForm.shenfenzhenghaoma))){
        this.$message.error(`身份证号码应输入身份证格式`);
        return
      }
                                                      if( 'yuangong' ==this.flag && this.ruleForm.shoujihaoma&&(!isMobile(this.ruleForm.shoujihaoma))){
        this.$message.error(`手机号码应输入手机格式`);
        return
      }
                                                                                                                                                                                                                                                                        this.$http({
        url: `${this.$storage.get("sessionTable")}/update`,
        method: "post",
        data: this.ruleForm
      }).then(({ data }) => {
        if (data && data.code === 0) {
          this.$message({
            message: "修改信息成功",
            type: "success",
            duration: 1500,
            onClose: () => {
            }
          });
        } else {
          this.$message.error(data.msg);
        }
      });
    }
  }
};
</script>
<style lang="scss" scoped>
</style>
