<template>
  <div class="card-body">
    <h5 class="card-title">Success!</h5>
    <p class="card-text">Your Data Has Been Submitted!</p>
    <router-link to="/" class="btn btn-primary text-white">Back</router-link>
  </div>
</template>

<script>
export default {
  name: "SuccesS",
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