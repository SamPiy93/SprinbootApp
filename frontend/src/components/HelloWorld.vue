<template>
  <div>
    <p v-if="posts && posts.length">{{posts}}</p>
    <button type="button" @click="headhunterList()">Headhunters</button>
    <button type="button" @click="clear()">clear</button>
  </div>
</template>

<script>
/* eslint-disable */
import axios from "axios";
// import { AXIOS } from './http-commons'

export default {
  data() {
    return {
      posts: null,
      errors: []
    };
  },

  methods: {
    headhunterList: function() {
      axios
        .get(`/api/headhunter/list`)
        .then(response => {
          console.error("response => ", response.data);
          this.posts = response.data;
        })
        .catch(e => {
          this.errors.push(e);
        });
    },
    clear: function() {
      this.posts = [];
    },
  }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1,
h2 {
  font-weight: normal;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
