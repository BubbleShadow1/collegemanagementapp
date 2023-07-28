public class CourActivity extends AppCompatActivity {
    private List<String> coursesList;
    private ArrayAdapter<String> coursesAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);

        coursesList = new ArrayList<>();
        coursesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, coursesList);

        ListView coursesListView = findViewById(R.id.coursesListView);
        coursesListView.setAdapter(coursesAdapter);

        Button addCourseButton = findViewById(R.id.addCourseButton);
        addCourseButton.setOnClickListener(v -> {
            coursesList.add("Sample Course");
            coursesAdapter.notifyDataSetChanged();
        });
    }
}
