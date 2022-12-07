<template>
  <div class="card-body">
    <h5 class="card-title">Success!</h5>
    <p class="card-text">Your Data Has Been {{ Judul }} !</p>
    <router-link to="/" v-if="Judul === 'Submit'">
      <button class="btn btn-primary m-3">Back</button>
    </router-link>
    <router-link to="/" v-else-if="Judul === 'Update'">
      <button class="btn btn-primary m-3">Back</button>
    </router-link>
    <button class="btn btn-primary" @click="RefreshFunc" v-else>Refresh</button>
  </div>
</template>

<script>
export default {
  name: "SuccesS",

  data() {
    return {
      Judul: null,
    };
  },

  methods: {
    ubahJudul() {
      let route = this.$route.fullPath;
      if (route === "/add") {
        this.Judul = "Submit";
      } else if (route === "/") {
        this.Judul = "Delete";
      } else {
        this.Judul = "Update";
      }
    },
    RefreshFunc() {
      location.reload();
    },
  },

  mounted() {
    this.ubahJudul();
  },
};
</script>

<style scoped>
.border-color-pink {
  border: solid 2px #f9cada;
}

.bg-color-pink {
  background-color: #f9cada;
}
</style>