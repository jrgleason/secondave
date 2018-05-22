<template lang="pug">
div(class="jg-header")

  md-button.md-icon-button(@click="toggle()")
      md-icon menu
  h1 {{ header }}
  h2 {{ subject }}
</template>
<script>
import MessageResolver from "./MessageResolver.js"
export default {
    mixins: [MessageResolver],
    props: ['subject'],
    data: function(){
        return {
            header: ""
        }
    },
    mounted: function(){
        this.getHeader();
    },
    methods: {
        toggle: function(){
            window.menuSubject.next();
        },
        getHeader: function(){
            this.getMessage("header.message").then((message)=>{
                console.log(message);
                this.header = message.bodyText;
            })
            return "Blah"
        }
    }
}
</script>
<style scoped>
.jg-header{
    z-index:1000;
    display:flex;
    align-items: center;
}
.jg-header > h1{
    flex: 1;
}
</style>