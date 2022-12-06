<template>
  <div class="container d-flex flex-wrap justify-content-center">
    <div class="card m-3 col-3" v-for="item in studentData" :key="item.id">
      <div class="card-body">
        <h5 class="card-title mb-3">
          {{ item.nama + ", " + "years old" }}
        </h5>

        <p>Email : {{ item.nama }}</p>
        <p>Soft Skill : {{ item.soft_skill }}</p>
        <p>Hard Skill : {{ item.hard_skill }}</p>
        <p>Interest : {{ item.interest }}</p>

        <div class="row">
          <div class="d-flex row mt-3">
            <router-link to="/update">
              <button type="submit" class="btn btn-primary row ml-4">
                Update
              </button>
            </router-link>
            <router-link to="#">
              <button type="submit" class="btn btn-danger">Delete</button>
            </router-link>
            <img class="img-gender" src="../assets/female.png" alt="" />
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import StudentServices from "@/services/StudentServices.js";

export default {
  name: "CardS",

  data() {
    return {
      studentData: null,
    };
  },

  // METHOD
  methods: {
    getStudent() {
      StudentServices.getAll()
        .then((response) => {
          this.studentData = response.data;
          console.log(this.studentData);
        })
        .catch((e) => {
          console.log(e);
        });
    },
  },

  // MOUNTED
  mounted() {
    this.getStudent();
  },
};
</script>

<style scoped>
.img {
  width: 50px;
}

.img-gender {
  width: 40px;
  height: auto;
  justify-content: flex-end;
  margin-left: 50px;
}

.btn {
  margin: 5px;
}
</style>>