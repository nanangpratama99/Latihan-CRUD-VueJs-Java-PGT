<template>
  <div class="">
    <BennerImage class="img"></BennerImage>
    <router-link to="/add">
      <button class="btn btn-primary my-3 ml-3">Add Data</button>
    </router-link>
    <div class="card">
      <Card class="col-12 m-3"></Card>
    </div>
    <Footer></Footer>
  </div>
</template>

<script>
import BennerImage from "@/components/BennerImage.vue";
import Footer from "@/components/Footer.vue";
import Card from "@/components/Card.vue";

export default {
  name: "MainPage",
  components: {
    BennerImage,
    Card,
    Footer,
  },
};
</script>

<style scoped>
.card {
  display: flex;
  flex-wrap: wrap;
}
</style>