<template>
    <div class="container center-align" style="margin-top:5%">
        <div class="row">
            <div class="col s6 offset-s3">
                <div class="card-panel ">
                <div class="row">
                    <form class="col s12">
                        <div class="row">
                            <div class="input-field col s12">
                            <input id="login" type="text" class="validate" v-model="logInData.login" @keyup.enter="login">
                            <label for="login">Login</label>
                            </div>                    
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                            <input id="password" type="password" class="validate" v-model="logInData.password" @keyup.enter="login">
                            <label for="password">Senha</label>
                            </div>
                        </div>    
                        <div class="row">
                            <form action="#">
                                <p>
                                <input type="checkbox" id="rememberme" true-value="Y" false-value="N" v-model="logInData.keepMeLoged"/>
                                <label for="rememberme">Mantenha-me logado</label>
                                </p>
                            </form>
                        </div>        
                        <div class="row right">
                            <a class="waves-effect waves-light btn"@click.prevent="login">Log In</a>
                        </div>
                    </form>
                </div>  
                </div>
            </div>
        </div>  
    </div>
</template>

<script>
export default {
    name:'pagina-login',
    data(){
        return {
            logInData:{
                login:'',
                password:'',
                keepMeLoged:'N'
            }
        }
    },
    methods:{
        login() {            
            this.$emit('autenticateUser');
        }
    }

}
</script>
