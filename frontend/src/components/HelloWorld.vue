<template>
  <div>
    <p v-if="posts && posts.length">{{posts}}</p>

    <button type="button" @click="hello()">click</button>
    <button type="button" @click="clear()">clear</button>
  </div>
</template>

<script>
// export default {
//   name: 'HelloWorld',
//   data () {
//     return {
//       msg: 'Welcome to Your Vue.js App'
//     }
//   }
// }
/* eslint-disable */
// import axios from "axios";
import { AXIOS } from './http-commons'

export default {
  data() {
    return {
      posts: [],
      errors: []
    };
  },

  // Fetches posts when the component is created.
  methods: {
      hello: function() {
        AXIOS
          .get(`http://localhost:8080/clients`)
          .then(response => {
            // JSON responses are automatically parsed.
            this.posts = response.data;
          })
          .catch(e => {
            this.errors.push(e);
          });

        // async / await version (created() becomes async created())
        //
        // try {
        //   const response = await axios.get(`http://jsonplaceholder.typicode.com/posts`)
        //   this.posts = response.data
        // } catch (e) {
        //   this.errors.push(e)
        // }
      },
      clear: function() {
        this.posts = []
      }
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
