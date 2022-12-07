<template>
  <div>
    <router-link to="/add" v-show="!success">
      <button class="btn btn-primary my-3 ml-3">Add Data</button>
    </router-link>

    <div class="container d-flex flex-wrap justify-content-center">
      <div
        class="card m-3 col-4"
        v-for="item in studentData"
        :key="item.id"
        v-show="!success"
      >
        <div class="card-body">
          <h5 class="card-title mb-3">
            {{ item.nama + ", " + item.umur + " years old" }}
          </h5>

          <p>Email : {{ item.email }}</p>
          <p>Soft Skill : {{ item.soft_skill }}</p>
          <p>Hard Skill : {{ item.hard_skill }}</p>
          <p>Interest : {{ item.interest }}</p>

          <div class="row">
            <div class="d-flex mt-3">
              <router-link :to="{ path: '/update/' + item.id }" type="submit" class="btn btn-primary ml-4">
                Update
              </router-link>
              <button
                type="submit"
                @click="deleteStudentFunc(item.id)"
                class="btn btn-danger"
              >
                Delete
              </button>
              <img
                v-if="item.jenis_kelamin === 'Male'"
                class="img-gender"
                src="../assets/male.png"
                alt=""
              />
              <img
                v-else
                class="img-gender"
                src="../assets/female.png"
                alt=""
              />
            </div>
          </div>
        </div>
      </div>
      <Success v-show="success"></Success>
    </div>
  </div>
</template>

<script>
import StudentServices from "@/services/StudentServices.js";
import Success from "@/components/Success.vue";

export default {
  name: "CardS",
  components: {
    Success,
  },

  data() {
    return {
      studentData: null,
      success: false,
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

    deleteStudentFunc(id) {
      if (confirm("Anda yakin ingin menghapus ?")) {
        StudentServices.delete(id)
          .then((response) => {
            console.log(response.data);
            this.success = true;
          })
          .catch((e) => {
            console.log(e);
          });
      } else {
        alert("Hapus Dibatalkan");
      }
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