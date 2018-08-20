<template>
  <div>
    <button class=”Search__button” @click="created()">CALL Spring Boot REST backend service</button>

    <h3>{{ response }}</h3>
  </div>
</template>
<script>
/* eslint-disable */
  import axios from 'axios';

  export default {
    name: 'Index',
    data() {
      return {
        response: [],
        errors: []
      }
    },

    created() {
      axios.get('http://localhost:8080/clients')
        .then(response => {
          this.response = response
          console.error('response => ', response)
        })
        .catch(err => {
          this.errors.push(err)
        })
    }
  }
</script>