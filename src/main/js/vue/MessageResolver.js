var MessageResolverMixin = {
    methods: {
        getMessage: function (key) {
            return this.$http.get('/i18n', {
                params: {key: key}
            });
        }
    }
}
export default MessageResolverMixin;