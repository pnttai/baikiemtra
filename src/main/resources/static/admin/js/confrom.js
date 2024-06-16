 function confirmAddSchedule(sportId) {
        if (confirm('Bạn có muốn tạo lịch thi đấu không?')) {
            window.location.href = '/admin/schedule-add?sportId=' + sportId;
        }
    }
