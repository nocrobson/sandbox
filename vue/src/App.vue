<template>
  <div id="app">
    <pagina-login
      v-if="!usuarioAutenticado"
      @autenticateUser="releaseMainScreenApp">
    </pagina-login>
    <div v-else>
      <nav>
        <div class="nav-wrapper teal">
          <a href="#" class="brand-logo" style="margin-left:15px; margin-top:5px;"><img src="./assets/logo.png" alt=""></a>
          <ul id="nav-mobile" class="right hide-on-med-and-down">
            <li><a href="#">Solicitar Marmita</a></li>
            <li><a href="#">Gerenciar Marmitas</a></li>
            <li><a href="#"><i class="material-icons">perm_identity</i></a></li>
          </ul>
        </div>
      </nav>
    </div>
  </div>
</template>
  
<script>
import PaginaLogin from './shared/components/PaginaLogin.vue';

export default {
  name: 'app',
  components: {
    PaginaLogin
  },
  data () {
    return {
      usuarioAutenticado:false
    }
  },
  methods:{
    releaseMainScreenApp(){
      this.usuarioAutenticado = true;
    }
  }
}
</script>

