<script>
$(document).ready(function(){
    $('.dropdown-toggle').on('click', function(e) {
        var $parent = $(this).closest('.dropdown');
        var isExpanded = $(this).attr('aria-expanded') === 'true';
        $parent.toggleClass('open', !isExpanded);
        $(this).attr('aria-expanded', !isExpanded);
    });

    // Optional: Close dropdown when clicking outside
    $(document).on('click', function(e) {
        if (!$(e.target).closest('.dropdown').length) {
            $('.dropdown').removeClass('open');
            $('.dropdown-toggle').attr('aria-expanded', 'false');
        }
    });
});
</script>
