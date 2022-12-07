<template>
  <div class="">
    <BennerImage class="img"></BennerImage>

    <div class="">
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