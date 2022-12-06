<template>
  <div>
    <BennerImage></BennerImage>
    <router-link to="/">
      <button class="ml-3 btn btn-primary my-3">Back</button>
    </router-link>
    <Form></Form>
    <Success class="d-none"></Success>
    <Footer></Footer>
  </div>
</template>
<script>
import BennerImage from "../components/BennerImage.vue";
import Form from "../components/Form.vue";
import Footer from "../components/Footer.vue";
import Success from "../components/Success.vue";

export default {
  name: "AddData",
  components: {
    BennerImage,
    Form,
    Success,
    Footer,
  },
};
</script>

<style scoped>
</style>>